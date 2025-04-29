package yarnwrap.util.crash;
public class ReportType { public net.minecraft.util.crash.ReportType wrapperContained; public ReportType(net.minecraft.util.crash.ReportType wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String chooseNugget() { return wrapperContained.chooseNugget(); }
// public static java.lang.String chooseNugget() { return net.minecraft.util.crash.ReportType.chooseNugget(); }
public void addHeaderAndNugget(java.lang.StringBuilder reportBuilder,java.util.List extraInfo) { wrapperContained.addHeaderAndNugget(reportBuilder,extraInfo); }
// public static void addHeaderAndNugget(java.lang.StringBuilder reportBuilder,java.util.List extraInfo, ) { net.minecraft.util.crash.ReportType.addHeaderAndNugget(reportBuilder,extraInfo); }

}