package yarnwrap.advancement;
public class AdvancementProgress { public net.minecraft.advancement.AdvancementProgress wrapperContained; public AdvancementProgress(net.minecraft.advancement.AdvancementProgress wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map criteriaProgresses() { return wrapperContained.criteriaProgresses; }
// public void criteriaProgresses(java.util.Map value) { wrapperContained.criteriaProgresses = value; }
// public static java.util.Map criteriaProgresses() { return net.minecraft.advancement.AdvancementProgress.criteriaProgresses; }
// public static void criteriaProgresses(java.util.Map value, ) { net.minecraft.advancement.AdvancementProgress.criteriaProgresses = value; }

// public yarnwrap.advancement.AdvancementRequirements requirements() { return new yarnwrap.advancement.AdvancementRequirements(wrapperContained.requirements); }
// public void requirements(yarnwrap.advancement.AdvancementRequirements value) { wrapperContained.requirements = value.wrapperContained; }
// public static yarnwrap.advancement.AdvancementRequirements requirements() { return new yarnwrap.advancement.AdvancementRequirements(net.minecraft.advancement.AdvancementProgress.requirements); }
// public static void requirements(yarnwrap.advancement.AdvancementRequirements value, ) { net.minecraft.advancement.AdvancementProgress.requirements = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.advancement.AdvancementProgress.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.advancement.AdvancementProgress.CODEC = value; }

// public java.time.format.DateTimeFormatter TIME_FORMATTER() { return wrapperContained.TIME_FORMATTER; }
// public void TIME_FORMATTER(java.time.format.DateTimeFormatter value) { wrapperContained.TIME_FORMATTER = value; }
// public static java.time.format.DateTimeFormatter TIME_FORMATTER() { return net.minecraft.advancement.AdvancementProgress.TIME_FORMATTER; }
// public static void TIME_FORMATTER(java.time.format.DateTimeFormatter value, ) { net.minecraft.advancement.AdvancementProgress.TIME_FORMATTER = value; }

// public com.mojang.serialization.Codec TIME_CODEC() { return wrapperContained.TIME_CODEC; }
// public void TIME_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TIME_CODEC = value; }
// public static com.mojang.serialization.Codec TIME_CODEC() { return net.minecraft.advancement.AdvancementProgress.TIME_CODEC; }
// public static void TIME_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.advancement.AdvancementProgress.TIME_CODEC = value; }

// public com.mojang.serialization.Codec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public void MAP_CODEC(com.mojang.serialization.Codec value) { wrapperContained.MAP_CODEC = value; }
// public static com.mojang.serialization.Codec MAP_CODEC() { return net.minecraft.advancement.AdvancementProgress.MAP_CODEC; }
// public static void MAP_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.advancement.AdvancementProgress.MAP_CODEC = value; }

// public AdvancementProgress(java.util.Map criteriaProgresses) { this.wrapperContained = new net.minecraft.advancement.AdvancementProgress(criteriaProgresses); }
// public int compareTo(java.lang.Object other) { return wrapperContained.compareTo(other); }
// public static int compareTo(java.lang.Object other, ) { return net.minecraft.advancement.AdvancementProgress.compareTo(other); }
public void init(yarnwrap.advancement.AdvancementRequirements requirements) { wrapperContained.init(requirements.wrapperContained); }
// public static void init(yarnwrap.advancement.AdvancementRequirements requirements, ) { net.minecraft.advancement.AdvancementProgress.init(requirements.wrapperContained); }
public yarnwrap.text.Text getProgressBarFraction() { return new yarnwrap.text.Text(wrapperContained.getProgressBarFraction()); }
// public static yarnwrap.text.Text getProgressBarFraction() { return new yarnwrap.text.Text(net.minecraft.advancement.AdvancementProgress.getProgressBarFraction()); }
public boolean reset(java.lang.String name) { return wrapperContained.reset(name); }
// public static boolean reset(java.lang.String name, ) { return net.minecraft.advancement.AdvancementProgress.reset(name); }
// public boolean method_730(java.util.Set progress) { return wrapperContained.method_730(progress); }
// public static boolean method_730(java.util.Set progress, ) { return net.minecraft.advancement.AdvancementProgress.method_730(progress); }
public java.lang.Iterable getUnobtainedCriteria() { return wrapperContained.getUnobtainedCriteria(); }
// public static java.lang.Iterable getUnobtainedCriteria() { return net.minecraft.advancement.AdvancementProgress.getUnobtainedCriteria(); }
// public yarnwrap.advancement.AdvancementProgress fromPacket(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.advancement.AdvancementProgress(wrapperContained.fromPacket(buf.wrapperContained)); }
// public static yarnwrap.advancement.AdvancementProgress fromPacket(yarnwrap.network.PacketByteBuf buf, ) { return new yarnwrap.advancement.AdvancementProgress(net.minecraft.advancement.AdvancementProgress.fromPacket(buf.wrapperContained)); }
public void toPacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.toPacket(buf.wrapperContained); }
// public static void toPacket(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.advancement.AdvancementProgress.toPacket(buf.wrapperContained); }
public java.lang.Iterable getObtainedCriteria() { return wrapperContained.getObtainedCriteria(); }
// public static java.lang.Iterable getObtainedCriteria() { return net.minecraft.advancement.AdvancementProgress.getObtainedCriteria(); }
public float getProgressBarPercentage() { return wrapperContained.getProgressBarPercentage(); }
// public static float getProgressBarPercentage() { return net.minecraft.advancement.AdvancementProgress.getProgressBarPercentage(); }
// public int countObtainedRequirements() { return wrapperContained.countObtainedRequirements(); }
// public static int countObtainedRequirements() { return net.minecraft.advancement.AdvancementProgress.countObtainedRequirements(); }
public yarnwrap.advancement.criterion.CriterionProgress getCriterionProgress(java.lang.String name) { return new yarnwrap.advancement.criterion.CriterionProgress(wrapperContained.getCriterionProgress(name)); }
// public static yarnwrap.advancement.criterion.CriterionProgress getCriterionProgress(java.lang.String name, ) { return new yarnwrap.advancement.criterion.CriterionProgress(net.minecraft.advancement.AdvancementProgress.getCriterionProgress(name)); }
public boolean isDone() { return wrapperContained.isDone(); }
// public static boolean isDone() { return net.minecraft.advancement.AdvancementProgress.isDone(); }
public java.time.Instant getEarliestProgressObtainDate() { return wrapperContained.getEarliestProgressObtainDate(); }
// public static java.time.Instant getEarliestProgressObtainDate() { return net.minecraft.advancement.AdvancementProgress.getEarliestProgressObtainDate(); }
public boolean isAnyObtained() { return wrapperContained.isAnyObtained(); }
// public static boolean isAnyObtained() { return net.minecraft.advancement.AdvancementProgress.isAnyObtained(); }
public boolean obtain(java.lang.String name) { return wrapperContained.obtain(name); }
// public static boolean obtain(java.lang.String name, ) { return net.minecraft.advancement.AdvancementProgress.obtain(name); }
// public void method_33895(yarnwrap.network.PacketByteBuf bufx,yarnwrap.advancement.criterion.CriterionProgress progresses) { wrapperContained.method_33895(bufx.wrapperContained,progresses.wrapperContained); }
// public static void method_33895(yarnwrap.network.PacketByteBuf bufx,yarnwrap.advancement.criterion.CriterionProgress progresses, ) { net.minecraft.advancement.AdvancementProgress.method_33895(bufx.wrapperContained,progresses.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53654(Object instance) { return wrapperContained.method_53654(instance); }
// public static com.mojang.datafixers.kinds.App method_53654(Object instance, ) { return net.minecraft.advancement.AdvancementProgress.method_53654(instance); }
// public java.time.temporal.TemporalAccessor method_53655(java.time.Instant instant) { return wrapperContained.method_53655(instant); }
// public static java.time.temporal.TemporalAccessor method_53655(java.time.Instant instant, ) { return net.minecraft.advancement.AdvancementProgress.method_53655(instant); }
// public java.time.Instant method_53656(Object entry) { return wrapperContained.method_53656(entry); }
// public static java.time.Instant method_53656(Object entry, ) { return net.minecraft.advancement.AdvancementProgress.method_53656(entry); }
// public java.util.Map method_53657(java.util.Map map) { return wrapperContained.method_53657(map); }
// public static java.util.Map method_53657(java.util.Map map, ) { return net.minecraft.advancement.AdvancementProgress.method_53657(map); }
// public yarnwrap.advancement.AdvancementProgress method_53658(java.util.Map criteriaProgresses,java.lang.Boolean done) { return new yarnwrap.advancement.AdvancementProgress(wrapperContained.method_53658(criteriaProgresses,done)); }
// public static yarnwrap.advancement.AdvancementProgress method_53658(java.util.Map criteriaProgresses,java.lang.Boolean done, ) { return new yarnwrap.advancement.AdvancementProgress(net.minecraft.advancement.AdvancementProgress.method_53658(criteriaProgresses,done)); }
// public java.util.Map method_53659(yarnwrap.advancement.AdvancementProgress advancementProgress) { return wrapperContained.method_53659(advancementProgress.wrapperContained); }
// public static java.util.Map method_53659(yarnwrap.advancement.AdvancementProgress advancementProgress, ) { return net.minecraft.advancement.AdvancementProgress.method_53659(advancementProgress.wrapperContained); }
// public boolean method_53660(Object entry) { return wrapperContained.method_53660(entry); }
// public static boolean method_53660(Object entry, ) { return net.minecraft.advancement.AdvancementProgress.method_53660(entry); }
// public java.util.Map method_53661(java.util.Map map) { return wrapperContained.method_53661(map); }
// public static java.util.Map method_53661(java.util.Map map, ) { return net.minecraft.advancement.AdvancementProgress.method_53661(map); }
// public boolean isCriterionObtained(java.lang.String name) { return wrapperContained.isCriterionObtained(name); }
// public static boolean isCriterionObtained(java.lang.String name, ) { return net.minecraft.advancement.AdvancementProgress.isCriterionObtained(name); }

}