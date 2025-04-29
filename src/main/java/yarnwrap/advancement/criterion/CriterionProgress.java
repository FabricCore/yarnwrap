package yarnwrap.advancement.criterion;
public class CriterionProgress { public net.minecraft.advancement.criterion.CriterionProgress wrapperContained; public CriterionProgress(net.minecraft.advancement.criterion.CriterionProgress wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.time.Instant obtainedTime() { return wrapperContained.obtainedTime; }
// public void obtainedTime(java.time.Instant value) { wrapperContained.obtainedTime = value; }
// public static java.time.Instant obtainedTime() { return net.minecraft.advancement.criterion.CriterionProgress.obtainedTime; }
// public static void obtainedTime(java.time.Instant value, ) { net.minecraft.advancement.criterion.CriterionProgress.obtainedTime = value; }

public CriterionProgress(java.time.Instant obtainedTime) { this.wrapperContained = new net.minecraft.advancement.criterion.CriterionProgress(obtainedTime); }
public boolean isObtained() { return wrapperContained.isObtained(); }
// public static boolean isObtained() { return net.minecraft.advancement.criterion.CriterionProgress.isObtained(); }
// public yarnwrap.advancement.criterion.CriterionProgress fromPacket(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.advancement.criterion.CriterionProgress(wrapperContained.fromPacket(buf.wrapperContained)); }
// public static yarnwrap.advancement.criterion.CriterionProgress fromPacket(yarnwrap.network.PacketByteBuf buf, ) { return new yarnwrap.advancement.criterion.CriterionProgress(net.minecraft.advancement.criterion.CriterionProgress.fromPacket(buf.wrapperContained)); }
public java.time.Instant getObtainedTime() { return wrapperContained.getObtainedTime(); }
// public static java.time.Instant getObtainedTime() { return net.minecraft.advancement.criterion.CriterionProgress.getObtainedTime(); }
public void toPacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.toPacket(buf.wrapperContained); }
// public static void toPacket(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.advancement.criterion.CriterionProgress.toPacket(buf.wrapperContained); }
public void obtain() { wrapperContained.obtain(); }
// public static void obtain() { net.minecraft.advancement.criterion.CriterionProgress.obtain(); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.advancement.criterion.CriterionProgress.reset(); }

}