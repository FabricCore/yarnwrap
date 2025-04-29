package yarnwrap.util.profiling.jfr;
public class InstanceType { public net.minecraft.util.profiling.jfr.InstanceType wrapperContained; public InstanceType(net.minecraft.util.profiling.jfr.InstanceType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.profiling.jfr.InstanceType.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.profiling.jfr.InstanceType.name = value; }

// public InstanceType(java.lang.String name) { this.wrapperContained = new net.minecraft.util.profiling.jfr.InstanceType(name); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.util.profiling.jfr.InstanceType.getName(); }
// public yarnwrap.util.profiling.jfr.InstanceType get(yarnwrap.server.MinecraftServer server) { return new yarnwrap.util.profiling.jfr.InstanceType(wrapperContained.get(server.wrapperContained)); }
// public static yarnwrap.util.profiling.jfr.InstanceType get(yarnwrap.server.MinecraftServer server, ) { return new yarnwrap.util.profiling.jfr.InstanceType(net.minecraft.util.profiling.jfr.InstanceType.get(server.wrapperContained)); }

}