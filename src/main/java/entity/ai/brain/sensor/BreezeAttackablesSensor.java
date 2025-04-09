package yarnwrap.entity.ai.brain.sensor;
public class BreezeAttackablesSensor { public net.minecraft.entity.ai.brain.sensor.BreezeAttackablesSensor wrapperContained; public BreezeAttackablesSensor(net.minecraft.entity.ai.brain.sensor.BreezeAttackablesSensor wrapperContained) { this.wrapperContained = wrapperContained; }

public int RANGE() { return wrapperContained.RANGE; }

}