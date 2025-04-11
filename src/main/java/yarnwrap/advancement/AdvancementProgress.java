package yarnwrap.advancement;
public class AdvancementProgress { public net.minecraft.advancement.AdvancementProgress wrapperContained; public AdvancementProgress(net.minecraft.advancement.AdvancementProgress wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map criteriaProgresses() { return wrapperContained.criteriaProgresses; }
// public void criteriaProgresses(java.util.Map value) { wrapperContained.criteriaProgresses = value; }
// public yarnwrap.advancement.AdvancementRequirements requirements() { return new yarnwrap.advancement.AdvancementRequirements(wrapperContained.requirements); }
// public void requirements(yarnwrap.advancement.AdvancementRequirements value) { wrapperContained.requirements = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.time.format.DateTimeFormatter TIME_FORMATTER() { return wrapperContained.TIME_FORMATTER; }
// public void TIME_FORMATTER(java.time.format.DateTimeFormatter value) { wrapperContained.TIME_FORMATTER = value; }
// public com.mojang.serialization.Codec TIME_CODEC() { return wrapperContained.TIME_CODEC; }
// public void TIME_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TIME_CODEC = value; }
// public com.mojang.serialization.Codec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public void MAP_CODEC(com.mojang.serialization.Codec value) { wrapperContained.MAP_CODEC = value; }
// public AdvancementProgress(java.util.Map criteriaProgresses) { this.wrapperContained = new net.minecraft.advancement.AdvancementProgress(criteriaProgresses); }
// public int compareTo(java.lang.Object other) { return wrapperContained.compareTo(other); }
// public void method_33895(yarnwrap.network.PacketByteBuf bufx,yarnwrap.advancement.criterion.CriterionProgress progresses) { wrapperContained.method_33895(bufx.wrapperContained,progresses.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53654(Object instance) { return wrapperContained.method_53654(instance); }
// public java.time.temporal.TemporalAccessor method_53655(java.time.Instant instant) { return wrapperContained.method_53655(instant); }
// public java.time.Instant method_53656(Object entry) { return wrapperContained.method_53656(entry); }
// public java.util.Map method_53657(java.util.Map map) { return wrapperContained.method_53657(map); }
// public yarnwrap.advancement.AdvancementProgress method_53658(java.util.Map criteriaProgresses,java.lang.Boolean done) { return new yarnwrap.advancement.AdvancementProgress(wrapperContained.method_53658(criteriaProgresses,done)); }
// public java.util.Map method_53659(yarnwrap.advancement.AdvancementProgress advancementProgress) { return wrapperContained.method_53659(advancementProgress.wrapperContained); }
// public boolean method_53660(Object entry) { return wrapperContained.method_53660(entry); }
// public java.util.Map method_53661(java.util.Map map) { return wrapperContained.method_53661(map); }
// public yarnwrap.advancement.criterion.CriterionProgress method_53662(Object entry) { return new yarnwrap.advancement.criterion.CriterionProgress(wrapperContained.method_53662(entry)); }
// public boolean isCriterionObtained(java.lang.String name) { return wrapperContained.isCriterionObtained(name); }
public void init(yarnwrap.advancement.AdvancementRequirements requirements) { wrapperContained.init(requirements.wrapperContained); }
public yarnwrap.text.Text getProgressBarFraction() { return new yarnwrap.text.Text(wrapperContained.getProgressBarFraction()); }
public boolean reset(java.lang.String name) { return wrapperContained.reset(name); }
// public boolean method_730(java.util.Set progress) { return wrapperContained.method_730(progress); }
public java.lang.Iterable getUnobtainedCriteria() { return wrapperContained.getUnobtainedCriteria(); }
public yarnwrap.advancement.AdvancementProgress fromPacket(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.advancement.AdvancementProgress(wrapperContained.fromPacket(buf.wrapperContained)); }
public void toPacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.toPacket(buf.wrapperContained); }
public java.lang.Iterable getObtainedCriteria() { return wrapperContained.getObtainedCriteria(); }
public float getProgressBarPercentage() { return wrapperContained.getProgressBarPercentage(); }
// public int countObtainedRequirements() { return wrapperContained.countObtainedRequirements(); }
public yarnwrap.advancement.criterion.CriterionProgress getCriterionProgress(java.lang.String name) { return new yarnwrap.advancement.criterion.CriterionProgress(wrapperContained.getCriterionProgress(name)); }
public boolean isDone() { return wrapperContained.isDone(); }
public java.time.Instant getEarliestProgressObtainDate() { return wrapperContained.getEarliestProgressObtainDate(); }
public boolean isAnyObtained() { return wrapperContained.isAnyObtained(); }
public boolean obtain(java.lang.String name) { return wrapperContained.obtain(name); }

}