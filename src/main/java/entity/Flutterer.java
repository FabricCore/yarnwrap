package yarnwrap.entity;
public class Flutterer { public net.minecraft.entity.Flutterer wrapperContained; public Flutterer(net.minecraft.entity.Flutterer wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isInAir() { return wrapperContained.isInAir(); }

}