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
public PointOfInterestSet(java.lang.Runnable updateListener) { this.wrapperContained = new net.minecraft.world.poi.PointOfInterestSet(updateListener); }
// public PointOfInterestSet(java.lang.Runnable updateListener,boolean valid,java.util.List pois) { this.wrapperContained = new net.minecraft.world.poi.PointOfInterestSet(updateListener,valid,pois); }
// public java.util.Set method_19143(yarnwrap.registry.entry.RegistryEntry type) { return wrapperContained.method_19143(type.wrapperContained); }
public void remove(yarnwrap.util.math.BlockPos pos) { wrapperContained.remove(pos.wrapperContained); }
public void add(yarnwrap.util.math.BlockPos pos,yarnwrap.registry.entry.RegistryEntry type) { wrapperContained.add(pos.wrapperContained,type.wrapperContained); }
public boolean test(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate) { return wrapperContained.test(pos.wrapperContained,predicate); }
// public java.util.stream.Stream method_19149(Object entry) { return wrapperContained.method_19149(entry); }
// public java.util.stream.Stream get(java.util.function.Predicate predicate,Object occupationStatus) { return wrapperContained.get(predicate,occupationStatus); }
// public boolean method_19151(java.util.function.Predicate entry) { return wrapperContained.method_19151(entry); }
public boolean releaseTicket(yarnwrap.util.math.BlockPos pos) { return wrapperContained.releaseTicket(pos.wrapperContained); }
public java.util.Optional getType(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getType(pos.wrapperContained); }
// public boolean add(yarnwrap.world.poi.PointOfInterest poi) { return wrapperContained.add(poi.wrapperContained); }
// public void method_20352(it.unimi.dsi.fastutil.shorts.Short2ObjectMap pos) { wrapperContained.method_20352(pos); }
public void updatePointsOfInterest(java.util.function.Consumer updater) { wrapperContained.updatePointsOfInterest(updater); }
// public void clear() { wrapperContained.clear(); }
// public boolean isValid() { return wrapperContained.isValid(); }
// public java.util.List method_28363(yarnwrap.world.poi.PointOfInterestSet poiSet) { return wrapperContained.method_28363(poiSet.wrapperContained); }
public com.mojang.serialization.Codec createCodec(java.lang.Runnable updateListener) { return wrapperContained.createCodec(updateListener); }
// public com.mojang.datafixers.kinds.App method_28365(java.lang.Runnable instance) { return wrapperContained.method_28365(instance); }
// public java.lang.Boolean method_28366(yarnwrap.world.poi.PointOfInterestSet poiSet) { return wrapperContained.method_28366(poiSet.wrapperContained); }
// public java.util.Optional get(yarnwrap.util.math.BlockPos pos) { return wrapperContained.get(pos.wrapperContained); }
public int getFreeTickets(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getFreeTickets(pos.wrapperContained); }

}