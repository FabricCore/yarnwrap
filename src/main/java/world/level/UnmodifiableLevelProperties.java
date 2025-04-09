package yarnwrap.world.level;
public class UnmodifiableLevelProperties { public net.minecraft.world.level.UnmodifiableLevelProperties wrapperContained; public UnmodifiableLevelProperties(net.minecraft.world.level.UnmodifiableLevelProperties wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.level.ServerWorldProperties worldProperties() { return new yarnwrap.world.level.ServerWorldProperties(wrapperContained.worldProperties); }
// public yarnwrap.world.SaveProperties saveProperties() { return new yarnwrap.world.SaveProperties(wrapperContained.saveProperties); }

}