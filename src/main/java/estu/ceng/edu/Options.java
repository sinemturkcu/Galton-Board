package estu.ceng.edu;

import org.kohsuke.args4j.Option;

public class Options {
    @Option(name = "-numThread", usage = "Number of Thread")
    int numThread;

    @Option(name = "-numBins", usage = "Number of Bins")
    int numBins;

}
