package yarnwrap.world.entity;
public class EntityLike { public net.minecraft.world.entity.EntityLike wrapperContained; public EntityLike(net.minecraft.world.entity.EntityLike wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.stream.Stream streamSelfAndPassengers() { return wrapperContained.streamSelfAndPassengers(); }
public yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos()); }
public void setChangeListener(yarnwrap.world.entity.EntityChangeListener changeListener) { wrapperContained.setChangeListener(changeListener.wrapperContained); }
// public void setRemoved(Object reason) { wrapperContained.setRemoved(reason); }
public boolean shouldSave() { return wrapperContained.shouldSave(); }
public boolean isPlayer() { return wrapperContained.isPlayer(); }
public java.util.stream.Stream streamPassengersAndSelf() { return wrapperContained.streamPassengersAndSelf(); }
public int getId() { return wrapperContained.getId(); }
public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
public yarnwrap.util.math.Box getBoundingBox() { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox()); }

}