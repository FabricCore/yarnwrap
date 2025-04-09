package yarnwrap.util.profiling.jfr;
public class InstanceType { public net.minecraft.util.profiling.jfr.InstanceType wrapperContained; public InstanceType(net.minecraft.util.profiling.jfr.InstanceType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
public java.lang.String getName() { return wrapperContained.getName(); }
public yarnwrap.util.profiling.jfr.InstanceType get(yarnwrap.server.MinecraftServer server) { return new yarnwrap.util.profiling.jfr.InstanceType(wrapperContained.get(server.wrapperContained)); }

}