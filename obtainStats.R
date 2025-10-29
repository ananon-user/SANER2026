library(dplyr)

#
jbse_data <- read.csv("JBSE_SymbolicRunStats.csv")
pose_data <- read.csv("POSE_SymbolicRunStats.csv")

jbse_data$methodToTest <- as.character(jbse_data$methodToTest)
pose_data$methodToTest <- as.character(pose_data$methodToTest)

#
jbse_data_tmp <- jbse_data
jbse_data_tmp <- subset(jbse_data_tmp, outOfMemory == "false")
jbse_data_tmp <- subset(jbse_data_tmp, timeOut == "false")
pose_data_tmp <- pose_data
pose_data_tmp <- subset(pose_data_tmp, outOfMemory == "false")
pose_data_tmp <- subset(pose_data_tmp, timeOut == "false")
joined_data <- inner_join(pose_data_tmp,
                          jbse_data_tmp,
                          by = "methodToTest",
                          suffix = c("_pose", "_jbse"))
no_good_numTraces_1 <- joined_data %>%
  filter(numTraces_pose > numTraces_jbse) %>%
  select(methodToTest, numTraces_pose, numTraces_jbse)

#
jbse_data_tmp <- jbse_data
jbse_data_tmp$numTraces <- jbse_data_tmp$numTraces
jbse_data_tmp <- subset(jbse_data_tmp, outOfMemory == "true")
pose_data_tmp <- pose_data
pose_data_tmp <- subset(pose_data_tmp, outOfMemory == "false")
pose_data_tmp <- subset(pose_data_tmp, timeOut == "false")
joined_data <- inner_join(pose_data_tmp,
                          jbse_data_tmp,
                          by = "methodToTest",
                          suffix = c("_pose", "_jbse"))
no_good_numTraces_2 <- joined_data %>%
  filter(numTraces_pose + pendingStates_pose > numTraces_jbse + pendingStates_jbse) %>%
  select(
    methodToTest,
    numTraces_pose,
    numTraces_jbse,
    pendingStates_pose,
    pendingStates_jbse
  )

#
jbse_data_tmp <- jbse_data
jbse_data_tmp <- subset(jbse_data_tmp, timeOut == "true")
pose_data_tmp <- pose_data
pose_data_tmp <- subset(pose_data_tmp, outOfMemory == "false")
pose_data_tmp <- subset(pose_data_tmp, timeOut == "false")
joined_data <- inner_join(pose_data_tmp,
                          jbse_data_tmp,
                          by = "methodToTest",
                          suffix = c("_pose", "_jbse"))
no_good_numTraces_3 <- joined_data %>%
  filter(numTraces_pose + pendingStates_pose > numTraces_jbse + pendingStates_jbse) %>%
  select(
    methodToTest,
    numTraces_pose,
    numTraces_jbse,
    pendingStates_pose,
    pendingStates_jbse
  )

#
jbse_data_tmp <- jbse_data
jbse_data_tmp <- subset(jbse_data_tmp, outOfMemory == "false")
jbse_data_tmp <- subset(jbse_data_tmp, timeOut == "false")
pose_data_tmp <- pose_data
pose_data_tmp <- subset(pose_data_tmp, outOfMemory == "true")
joined_data <- inner_join(pose_data_tmp,
                          jbse_data_tmp,
                          by = "methodToTest",
                          suffix = c("_pose", "_jbse"))
no_good_numTraces_4 <- joined_data %>%
  filter(numTraces_pose + pendingStates_pose < numTraces_jbse + pendingStates_jbse) %>%
  select(
    methodToTest,
    numTraces_pose,
    numTraces_jbse,
    pendingStates_pose,
    pendingStates_jbse
  )

#
jbse_data_tmp <- jbse_data
jbse_data_tmp <- subset(jbse_data_tmp, outOfMemory == "false")
jbse_data_tmp <- subset(jbse_data_tmp, timeOut == "false")
pose_data_tmp <- pose_data
pose_data_tmp <- subset(pose_data_tmp, timeOut == "true")
joined_data <- inner_join(pose_data_tmp,
                          jbse_data_tmp,
                          by = "methodToTest",
                          suffix = c("_pose", "_jbse"))
no_good_numTraces_5 <- joined_data %>%
  filter(numTraces_pose + pendingStates_pose < numTraces_jbse + pendingStates_jbse) %>%
  select(
    methodToTest,
    numTraces_pose,
    numTraces_jbse,
    pendingStates_pose,
    pendingStates_jbse
  )

#
jbse_data_tmp <- jbse_data
jbse_data_tmp <- subset(jbse_data, outOfMemory == "true" |
                          timeOut == "true")
pose_data_tmp <- pose_data
pose_data_tmp <- subset(pose_data, outOfMemory == "true" |
                          timeOut == "TRUE")
joined_data <- inner_join(pose_data_tmp,
                          jbse_data_tmp,
                          by = "methodToTest",
                          suffix = c("_pose", "_jbse"))
no_good_numTraces_6 <- joined_data %>%
  select(
    methodToTest,
    numTraces_pose,
    numTraces_jbse,
    pendingStates_pose,
    pendingStates_jbse
  )


#
inconclusives <- merge(no_good_numTraces_1, no_good_numTraces_2, all = TRUE)
inconclusives <- merge(inconclusives, no_good_numTraces_3, all = TRUE)
inconclusives <- merge(inconclusives, no_good_numTraces_4, all = TRUE)
inconclusives <- merge(inconclusives, no_good_numTraces_5, all = TRUE)
inconclusives <- merge(inconclusives, no_good_numTraces_6, all = TRUE)

jbse_data_tmp <- jbse_data
pose_data_tmp <- pose_data
joined_data <- inner_join(pose_data_tmp,
                          jbse_data_tmp,
                          by = "methodToTest",
                          suffix = c("_pose", "_jbse"))

inconclusiveMethods <- inconclusives$methodToTest

inconclusives_filtered <- joined_data[!(joined_data$methodToTest %in% inconclusiveMethods), ]

inconclusives_filtered <- inconclusives_filtered %>%
  select(
    methodToTest,
    methodClass_pose,
    numTraces_pose,
    numTraces_jbse,
    pendingStates_pose,
    pendingStates_jbse,
    numTokensQueries_pose,
    numTokensQueries_jbse,
    durationIsSat_pose,
    durationIsSat_jbse,
    durationTotal_pose,
    durationTotal_jbse
  )

summarize_by_class <- inconclusives_filtered %>%
  select(-methodToTest) %>%
  group_by(methodClass_pose) %>%
  summarise(across(.cols = everything(), .fns = \(x) sum(x, na.rm = TRUE)))

totalTraces_pose <- (summarize_by_class$numTraces_pose + summarize_by_class$pendingStates_pose)
totalTraces_jbse <- (summarize_by_class$numTraces_jbse + summarize_by_class$pendingStates_jbse)
diff_traces <- totalTraces_pose - totalTraces_jbse
summarize_by_class$totalTraces_pose <- totalTraces_pose
summarize_by_class$totalTraces_jbse <- totalTraces_jbse
summarize_by_class$diff_traces <- diff_traces

summarize_by_class <- summarize_by_class %>%
  select(
    methodClass_pose,
    totalTraces_pose,
    totalTraces_jbse,
    numTokensQueries_pose,
    numTokensQueries_jbse,
    durationIsSat_pose,
    durationIsSat_jbse,
    durationTotal_pose,
    durationTotal_jbse,
    diff_traces
  )

summarize_by_class <- summarize_by_class[order(summarize_by_class$totalTraces_jbse, decreasing = TRUE), ]
summarize_by_class <- summarize_by_class[order(summarize_by_class$diff_traces), ]
summarize_by_class$durationIsSat_jbse <- round(summarize_by_class$durationIsSat_jbse, 0)
summarize_by_class$diff_traces <- NULL

write.csv(summarize_by_class, "results.csv", row.names = FALSE)
