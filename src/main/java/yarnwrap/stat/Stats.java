package yarnwrap.stat;
public class Stats { public net.minecraft.stat.Stats wrapperContained; public Stats(net.minecraft.stat.Stats wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.stat.StatType registerType(java.lang.String id,yarnwrap.registry.Registry registry) { return new yarnwrap.stat.StatType(wrapperContained.registerType(id,registry.wrapperContained)); }
// public static yarnwrap.stat.StatType registerType(java.lang.String id,yarnwrap.registry.Registry registry, ) { return new yarnwrap.stat.StatType(net.minecraft.stat.Stats.registerType(id,registry.wrapperContained)); }
// public yarnwrap.util.Identifier register(java.lang.String id,yarnwrap.stat.StatFormatter formatter) { return new yarnwrap.util.Identifier(wrapperContained.register(id,formatter.wrapperContained)); }
// public static yarnwrap.util.Identifier register(java.lang.String id,yarnwrap.stat.StatFormatter formatter, ) { return new yarnwrap.util.Identifier(net.minecraft.stat.Stats.register(id,formatter.wrapperContained)); }

}