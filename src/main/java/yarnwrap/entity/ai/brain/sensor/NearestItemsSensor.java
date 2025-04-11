package yarnwrap.entity.ai.brain.sensor;
public class NearestItemsSensor { public net.minecraft.entity.ai.brain.sensor.NearestItemsSensor wrapperContained; public NearestItemsSensor(net.minecraft.entity.ai.brain.sensor.NearestItemsSensor wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_RANGE() { return wrapperContained.MAX_RANGE; }
// public void MAX_RANGE(int value) { wrapperContained.MAX_RANGE = value; }
// public long HORIZONTAL_RANGE() { return wrapperContained.HORIZONTAL_RANGE; }
// public void HORIZONTAL_RANGE(long value) { wrapperContained.HORIZONTAL_RANGE = value; }
// public long VERTICAL_RANGE() { return wrapperContained.VERTICAL_RANGE; }
// public void VERTICAL_RANGE(long value) { wrapperContained.VERTICAL_RANGE = value; }
// public boolean method_24643(yarnwrap.entity.mob.MobEntity itemEntity) { return wrapperContained.method_24643(itemEntity.wrapperContained); }
// public boolean method_24644(yarnwrap.entity.ItemEntity itemEntity) { return wrapperContained.method_24644(itemEntity.wrapperContained); }
// public boolean method_24646(yarnwrap.entity.mob.MobEntity itemEntity) { return wrapperContained.method_24646(itemEntity.wrapperContained); }

}