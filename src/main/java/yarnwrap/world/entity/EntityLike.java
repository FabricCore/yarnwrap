package yarnwrap.world.entity;
public class EntityLike { public net.minecraft.world.entity.EntityLike wrapperContained; public EntityLike(net.minecraft.world.entity.EntityLike wrapperContained) { this.wrapperContained = wrapperContained; }

public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.world.entity.EntityLike.getId(); }
public yarnwrap.util.math.Box getBoundingBox() { return new yarnwrap.util.math.Box(wrapperContained.getBoundingBox()); }
// public static yarnwrap.util.math.Box getBoundingBox() { return new yarnwrap.util.math.Box(net.minecraft.world.entity.EntityLike.getBoundingBox()); }
public java.util.stream.Stream streamSelfAndPassengers() { return wrapperContained.streamSelfAndPassengers(); }
// public static java.util.stream.Stream streamSelfAndPassengers() { return net.minecraft.world.entity.EntityLike.streamSelfAndPassengers(); }
public yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos()); }
// public static yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.entity.EntityLike.getBlockPos()); }
public void setChangeListener(yarnwrap.world.entity.EntityChangeListener changeListener) { wrapperContained.setChangeListener(changeListener.wrapperContained); }
// public static void setChangeListener(yarnwrap.world.entity.EntityChangeListener changeListener, ) { net.minecraft.world.entity.EntityLike.setChangeListener(changeListener.wrapperContained); }
// public void setRemoved(Object reason) { wrapperContained.setRemoved(reason); }
// public static void setRemoved(Object reason, ) { net.minecraft.world.entity.EntityLike.setRemoved(reason); }
public boolean shouldSave() { return wrapperContained.shouldSave(); }
// public static boolean shouldSave() { return net.minecraft.world.entity.EntityLike.shouldSave(); }
public boolean isPlayer() { return wrapperContained.isPlayer(); }
// public static boolean isPlayer() { return net.minecraft.world.entity.EntityLike.isPlayer(); }
public java.util.stream.Stream streamPassengersAndSelf() { return wrapperContained.streamPassengersAndSelf(); }
// public static java.util.stream.Stream streamPassengersAndSelf() { return net.minecraft.world.entity.EntityLike.streamPassengersAndSelf(); }

}