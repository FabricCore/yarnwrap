package yarnwrap.entity;
public class SpawnLocationTypes { public net.minecraft.entity.SpawnLocationTypes wrapperContained; public SpawnLocationTypes(net.minecraft.entity.SpawnLocationTypes wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.SpawnLocation UNRESTRICTED() { return new yarnwrap.entity.SpawnLocation(wrapperContained.UNRESTRICTED); }
public yarnwrap.entity.SpawnLocation IN_WATER() { return new yarnwrap.entity.SpawnLocation(wrapperContained.IN_WATER); }
public yarnwrap.entity.SpawnLocation IN_LAVA() { return new yarnwrap.entity.SpawnLocation(wrapperContained.IN_LAVA); }
public yarnwrap.entity.SpawnLocation ON_GROUND() { return new yarnwrap.entity.SpawnLocation(wrapperContained.ON_GROUND); }

}