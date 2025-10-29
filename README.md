# SANER2026 replicability package and supplemental material

This repository contains the replicability package and supplemental material for the paper "Path-Optimal Symbolic Execution of Heap-Manipulating Programs".

## Organization of the repository

The repository contains the following files and directories:

- appendix/: this directory contains just the PDF file for the external appendix of the paper;
- jars/: this directory contains the jar files for the versions of the symbolic executors used for the experiments (JBSE and the POSE prototype) and for the automated experiment launcher;
- projects/: this directory contains the source code and the binaries for the subject programs used in the experiments contained in the paper;
- Makefile, obtainStats.R: script files, necessary to launch everything.

## Prerequisites

In order to successfully run the replicability package you need:

- a POSIX environment, with standard shell and commands (cat, sed, etc);
- git, so you can clone this repository;
- make (not necessarily GNU make);
- a Java Development Kit version 8 must be in the path (note that a version different from 8, either superior or inferior, will not work); For Linux systems you can use Eclipse Temurim from [Adoptium](https://adoptium.net/); For macOS systems you can use the JDK Zulu distribution from [Azul](https://www.azul.com/downloads/?package=jdk#zulu);
- [Apache Maven](https://maven.apache.org/);
- a recent version of [Z3](https://github.com/Z3Prover/z3), preferrabily version 4.8.9 (see section "Degree of replicability" below);
- [R](https://www.r-project.org/).

## Setup

Once you have cloned this repository, e.g., to /home/myself/SANER2026, you need to tweak a little the Makefile. Edit its second line:

    Z3_PATH := "/opt/homebrew/bin"

so it reflects the path where the executable of Z3 is found on your machine. Note that the variable must point *not* to the executable *but* to the directory that contains it. For instance, if the Z3 executable on your machine is /usr/local/bin/z3 you shall modify the line as follows:

    Z3_PATH := "/usr/local/bin"

## Running

The Makefile contains the following make targets:

- all: launches all the experiments, for POSE and for JBSE, and then invokes R to create a file named results.csv. This file contains a table synthesizing the experiment data. The table has the same shape as Table I in the SANER 2026 submission.
- clean: deletes all the temporary files.
- clean-projects: deletes all the classfiles of the experiment subjects. Use it only if you have issues with the pre-built experiment subjects that come with the replication package (it should not be the case, anyways).
- build-projects: rebuilds the experiment subjects. Use it after clean-projects.

Launching the experiments should therefore be just a matter of:

    $ cd /home/myself/SANER2026
    $ make all

Be warned: because of the size of the benchmark (and of the state space of some methods in it) running all the experiments will require a *lot* of time---up to two weeks in our experience. To speed the things up a little bit you can tweak the value of the PROCESSES variable in the Makefile (number of methods that are symbolically executed in a concurrent process) and increase it, based on the number of CPUs on your machine, but consider that this might jeopardize replicability (see the next section for more information).

To be sure that everything works do *not* rely on the console output: It will contain lots of warnings, log messages, and even exception stack traces, that cannot be easily interpreted. Rather, check whether you find a file named POSE_SymbolicRunStats.csv in /home/myself/SANER2026, and whether this file grows in time. 

## Degree of replicability

Some factors may cause, if not adequately controlled, the results of the experiments produced with this replication package to differ from that reported in the SANER 2026 submission, Table I. Here we report about these factors and how they can be controlled in order to ensure maximum replicability.

- Both JBSE and the POSE prototype have a very deterministic behavior, so whenever the symbolic execution of all the methods of a class successfully terminate, the "#traces" and "#tokens" values for the class should be identical to that indicated in Table I. Unfortunately, different versions of Z3 have, in some cases, produced different results when fed by same queries, an issue that has produced some (albeit small) discrepancies when reproducing the experiments. For this reason we advice to use version 4.8.9 of Z3, the same we used for the experiments reported in the SANER 2026 submission.
- All the experiments in the SANER 2026 submission were executed with a limit of 44 GBytes of heap memory and 8 GBytes of stack memory, and a timeout of 6 hours per method. The XMX, XMS, and TIMEOUT variables in the Makefile reflect these values. Execution times are very dependent on the features and on the total workload of the machine on which the experiments are run: As a result, the "Query time" and "Test time" columns of Table I cannot be reproduced with perfect precision by running this replicability package on an arbitrary machine (all the experiments were run on an Ubuntu virtual machine with 48 virtual CPUs clocked at 2.2GHz). Another possible effect is that the set of inconclusive methods (timed out or crashed due to memory exhaustion) may slightly differ from that obtained in our experiments, and this may have a limited impact on the values in the "#traces" and "#tokens" columns for a given class. Of course, if you tweak the XMX, XMS and TIMEOUT parameters in the Makefile you must expect major discrepancies.
- The number of parallel processes (variable PROCESSES in the Makefile) has an indirect impact on the total number of symbolic executions that crash because of memory exhaustion. We ran our experiments on a virtual machine with 169 GBytes of memory, and we set the number of parallel processes to 2 in order to be sure that each process could be granted 44 GBytes of heap memory and 8 GBytes of stack memory during its whole execution. If you increment the value of the PROCESSES variable be careful to ensure that each process still can consume all the necessary memory, or you will experience more crashes than expected.

If you take into account all these factors, you should be able to reproduce the experimental data reported in the SANER 2006 submission with high precision.
