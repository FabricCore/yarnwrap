package yarnwrap.datafixer.fix;
public class PointOfInterestRemoveFix { public net.minecraft.datafixer.fix.PointOfInterestRemoveFix wrapperContained; public PointOfInterestRemoveFix(net.minecraft.datafixer.fix.PointOfInterestRemoveFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Predicate keepPredicate() { return wrapperContained.keepPredicate; }
// public void keepPredicate(java.util.function.Predicate value) { wrapperContained.keepPredicate = value; }
// public static java.util.function.Predicate keepPredicate() { return net.minecraft.datafixer.fix.PointOfInterestRemoveFix.keepPredicate; }
// public static void keepPredicate(java.util.function.Predicate value, ) { net.minecraft.datafixer.fix.PointOfInterestRemoveFix.keepPredicate = value; }

public PointOfInterestRemoveFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.function.Predicate removePredicate) { this.wrapperContained = new net.minecraft.datafixer.fix.PointOfInterestRemoveFix(outputSchema,name,removePredicate); }
// public boolean shouldKeepRecord(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.shouldKeepRecord(dynamic); }
// public static boolean shouldKeepRecord(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.datafixer.fix.PointOfInterestRemoveFix.shouldKeepRecord(dynamic); }

}