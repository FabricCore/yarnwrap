package yarnwrap.world.poi;
public class PointOfInterestSet { public net.minecraft.world.poi.PointOfInterestSet wrapperContained; public PointOfInterestSet(net.minecraft.world.poi.PointOfInterestSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.poi.PointOfInterestSet.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.poi.PointOfInterestSet.LOGGER = value; }

// public it.unimi.dsi.fastutil.shorts.Short2ObjectMap pointsOfInterestByPos() { return wrapperContained.pointsOfInterestByPos; }
// public void pointsOfInterestByPos(it.unimi.dsi.fastutil.shorts.Short2ObjectMap value) { wrapperContained.pointsOfInterestByPos = value; }
// public static it.unimi.dsi.fastutil.shorts.Short2ObjectMap pointsOfInterestByPos() { return net.minecraft.world.poi.PointOfInterestSet.pointsOfInterestByPos; }
// public static void pointsOfInterestByPos(it.unimi.dsi.fastutil.shorts.Short2ObjectMap value, ) { net.minecraft.world.poi.PointOfInterestSet.pointsOfInterestByPos = value; }

// public java.util.Map pointsOfInterestByType() { return wrapperContained.pointsOfInterestByType; }
// public void pointsOfInterestByType(java.util.Map value) { wrapperContained.pointsOfInterestByType = value; }
// public static java.util.Map pointsOfInterestByType() { return net.minecraft.world.poi.PointOfInterestSet.pointsOfInterestByType; }
// public static void pointsOfInterestByType(java.util.Map value, ) { net.minecraft.world.poi.PointOfInterestSet.pointsOfInterestByType = value; }

// public java.lang.Runnable updateListener() { return wrapperContained.updateListener; }
// public void updateListener(java.lang.Runnable value) { wrapperContained.updateListener = value; }
// public static java.lang.Runnable updateListener() { return net.minecraft.world.poi.PointOfInterestSet.updateListener; }
// public static void updateListener(java.lang.Runnable value, ) { net.minecraft.world.poi.PointOfInterestSet.updateListener = value; }

// public boolean valid() { return wrapperContained.valid; }
// public void valid(boolean value) { wrapperContained.valid = value; }
// public static boolean valid() { return net.minecraft.world.poi.PointOfInterestSet.valid; }
// public static void valid(boolean value, ) { net.minecraft.world.poi.PointOfInterestSet.valid = value; }

public PointOfInterestSet(java.lang.Runnable updateListener) { this.wrapperContained = new net.minecraft.world.poi.PointOfInterestSet(updateListener); }
// public PointOfInterestSet(java.lang.Runnable updateListener,boolean valid,java.util.List pois) { this.wrapperContained = new net.minecraft.world.poi.PointOfInterestSet(updateListener,valid,pois); }
// public java.util.Set method_19143(yarnwrap.registry.entry.RegistryEntry type) { return wrapperContained.method_19143(type.wrapperContained); }
// public static java.util.Set method_19143(yarnwrap.registry.entry.RegistryEntry type, ) { return net.minecraft.world.poi.PointOfInterestSet.method_19143(type.wrapperContained); }
public void remove(yarnwrap.util.math.BlockPos pos) { wrapperContained.remove(pos.wrapperContained); }
// public static void remove(yarnwrap.util.math.BlockPos pos, ) { net.minecraft.world.poi.PointOfInterestSet.remove(pos.wrapperContained); }
public void add(yarnwrap.util.math.BlockPos pos,yarnwrap.registry.entry.RegistryEntry type) { wrapperContained.add(pos.wrapperContained,type.wrapperContained); }
// public static void add(yarnwrap.util.math.BlockPos pos,yarnwrap.registry.entry.RegistryEntry type, ) { net.minecraft.world.poi.PointOfInterestSet.add(pos.wrapperContained,type.wrapperContained); }
public boolean test(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate) { return wrapperContained.test(pos.wrapperContained,predicate); }
// public static boolean test(yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate, ) { return net.minecraft.world.poi.PointOfInterestSet.test(pos.wrapperContained,predicate); }
// public java.util.stream.Stream method_19149(Object entry) { return wrapperContained.method_19149(entry); }
// public static java.util.stream.Stream method_19149(Object entry, ) { return net.minecraft.world.poi.PointOfInterestSet.method_19149(entry); }
// public java.util.stream.Stream get(java.util.function.Predicate predicate,Object occupationStatus) { return wrapperContained.get(predicate,occupationStatus); }
// public static java.util.stream.Stream get(java.util.function.Predicate predicate,Object occupationStatus, ) { return net.minecraft.world.poi.PointOfInterestSet.get(predicate,occupationStatus); }
// public boolean method_19151(java.util.function.Predicate entry) { return wrapperContained.method_19151(entry); }
// public static boolean method_19151(java.util.function.Predicate entry, ) { return net.minecraft.world.poi.PointOfInterestSet.method_19151(entry); }
public boolean releaseTicket(yarnwrap.util.math.BlockPos pos) { return wrapperContained.releaseTicket(pos.wrapperContained); }
// public static boolean releaseTicket(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.poi.PointOfInterestSet.releaseTicket(pos.wrapperContained); }
public java.util.Optional getType(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getType(pos.wrapperContained); }
// public static java.util.Optional getType(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.poi.PointOfInterestSet.getType(pos.wrapperContained); }
// public boolean add(yarnwrap.world.poi.PointOfInterest poi) { return wrapperContained.add(poi.wrapperContained); }
// public static boolean add(yarnwrap.world.poi.PointOfInterest poi, ) { return net.minecraft.world.poi.PointOfInterestSet.add(poi.wrapperContained); }
// public void method_20352(it.unimi.dsi.fastutil.shorts.Short2ObjectMap pos) { wrapperContained.method_20352(pos); }
// public static void method_20352(it.unimi.dsi.fastutil.shorts.Short2ObjectMap pos, ) { net.minecraft.world.poi.PointOfInterestSet.method_20352(pos); }
public void updatePointsOfInterest(java.util.function.Consumer updater) { wrapperContained.updatePointsOfInterest(updater); }
// public static void updatePointsOfInterest(java.util.function.Consumer updater, ) { net.minecraft.world.poi.PointOfInterestSet.updatePointsOfInterest(updater); }
// public void clear() { wrapperContained.clear(); }
// public static void clear() { net.minecraft.world.poi.PointOfInterestSet.clear(); }
// public boolean isValid() { return wrapperContained.isValid(); }
// public static boolean isValid() { return net.minecraft.world.poi.PointOfInterestSet.isValid(); }
// public java.util.List method_28363(yarnwrap.world.poi.PointOfInterestSet poiSet) { return wrapperContained.method_28363(poiSet.wrapperContained); }
// public static java.util.List method_28363(yarnwrap.world.poi.PointOfInterestSet poiSet, ) { return net.minecraft.world.poi.PointOfInterestSet.method_28363(poiSet.wrapperContained); }
// public com.mojang.serialization.Codec createCodec(java.lang.Runnable updateListener) { return wrapperContained.createCodec(updateListener); }
// public static com.mojang.serialization.Codec createCodec(java.lang.Runnable updateListener, ) { return net.minecraft.world.poi.PointOfInterestSet.createCodec(updateListener); }
// public com.mojang.datafixers.kinds.App method_28365(java.lang.Runnable instance) { return wrapperContained.method_28365(instance); }
// public static com.mojang.datafixers.kinds.App method_28365(java.lang.Runnable instance, ) { return net.minecraft.world.poi.PointOfInterestSet.method_28365(instance); }
// public java.lang.Boolean method_28366(yarnwrap.world.poi.PointOfInterestSet poiSet) { return wrapperContained.method_28366(poiSet.wrapperContained); }
// public static java.lang.Boolean method_28366(yarnwrap.world.poi.PointOfInterestSet poiSet, ) { return net.minecraft.world.poi.PointOfInterestSet.method_28366(poiSet.wrapperContained); }
// public java.util.Optional get(yarnwrap.util.math.BlockPos pos) { return wrapperContained.get(pos.wrapperContained); }
// public static java.util.Optional get(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.poi.PointOfInterestSet.get(pos.wrapperContained); }
public int getFreeTickets(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getFreeTickets(pos.wrapperContained); }
// public static int getFreeTickets(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.poi.PointOfInterestSet.getFreeTickets(pos.wrapperContained); }

}