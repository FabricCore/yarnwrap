package yarnwrap.datafixer.fix;
public class TrialSpawnerConfigTagFix { public net.minecraft.datafixer.fix.TrialSpawnerConfigTagFix wrapperContained; public TrialSpawnerConfigTagFix(net.minecraft.datafixer.fix.TrialSpawnerConfigTagFix wrapperContained) { this.wrapperContained = wrapperContained; }

public TrialSpawnerConfigTagFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.TrialSpawnerConfigTagFix(outputSchema); }
// public com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic data) { return wrapperContained.fix(data); }
// public static com.mojang.serialization.Dynamic fix(com.mojang.serialization.Dynamic data, ) { return net.minecraft.datafixer.fix.TrialSpawnerConfigTagFix.fix(data); }

}