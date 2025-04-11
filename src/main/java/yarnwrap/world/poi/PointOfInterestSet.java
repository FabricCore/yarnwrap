package yarnwrap.world.poi;
public class PointOfInterestSet { public net.minecraft.world.poi.PointOfInterestSet wrapperContained; public PointOfInterestSet(net.minecraft.world.poi.PointOfInterestSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public it.unimi.dsi.fastutil.shorts.Short2ObjectMap pointsOfInterestByPos() { return wrapperContained.pointsOfInterestByPos; }
// public void pointsOfInterestByPos(it.unimi.dsi.fastutil.shorts.Short2ObjectMap value) { wrapperContained.pointsOfInterestByPos = value; }
// public java.util.Map pointsOfInterestByType() { return wrapperContained.pointsOfInterestByType; }
// public void pointsOfInterestByType(java.util.Map value) { wrapperContained.pointsOfInterestByType = value; }
// public java.lang.Runnable updateListener() { return wrapperContained.updateListener; }
// public void updateListener(java.lang.Runnable value) { wrapperContained.updateListener = value; }
// public boolean valid() { return wrapperContained.valid; }
// public void valid(boolean value) { wrapperContained.valid = value; }
public void remove(yarnwrap.util.math.BlockPos pos) { wrapperContained.remove(pos.wrapperContained); }
public void add(yarnwrap.util.math.BlockPos pos,yarnwrap.registry.entry.RegistryEntry type) { wrapperContained.add(pos.wrapperContained,type.wrapperContained); }
public boolean test(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate) { return wrapperContained.test(pos.wrapperContained,predicate); }
// public java.util.stream.Stream get(java.util.function.Predicate predicate,Object occupationStatus) { return wrapperContained.get(predicate,occupationStatus); }
public boolean releaseTicket(yarnwrap.util.math.BlockPos pos) { return wrapperContained.releaseTicket(pos.wrapperContained); }
public java.util.Optional getType(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getType(pos.wrapperContained); }
// public boolean add(yarnwrap.world.poi.PointOfInterest poi) { return wrapperContained.add(poi.wrapperContained); }
public void updatePointsOfInterest(java.util.function.Consumer updater) { wrapperContained.updatePointsOfInterest(updater); }
// public void clear() { wrapperContained.clear(); }
// public boolean isValid() { return wrapperContained.isValid(); }
public com.mojang.serialization.Codec createCodec(java.lang.Runnable updateListener) { return wrapperContained.createCodec(updateListener); }
// public java.util.Optional get(yarnwrap.util.math.BlockPos pos) { return wrapperContained.get(pos.wrapperContained); }
public int getFreeTickets(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getFreeTickets(pos.wrapperContained); }

}