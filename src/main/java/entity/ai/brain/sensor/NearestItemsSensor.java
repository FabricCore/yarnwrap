package yarnwrap.entity.ai.brain.sensor;
public class NearestItemsSensor { public net.minecraft.entity.ai.brain.sensor.NearestItemsSensor wrapperContained; public NearestItemsSensor(net.minecraft.entity.ai.brain.sensor.NearestItemsSensor wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_RANGE() { return wrapperContained.MAX_RANGE; }
// public long HORIZONTAL_RANGE() { return wrapperContained.HORIZONTAL_RANGE; }
// public long VERTICAL_RANGE() { return wrapperContained.VERTICAL_RANGE; }

}