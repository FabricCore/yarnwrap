package yarnwrap.advancement;
public class AdvancementProgress { public net.minecraft.advancement.AdvancementProgress wrapperContained; public AdvancementProgress(net.minecraft.advancement.AdvancementProgress wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map criteriaProgresses() { return wrapperContained.criteriaProgresses; }
// public yarnwrap.advancement.AdvancementRequirements requirements() { return new yarnwrap.advancement.AdvancementRequirements(wrapperContained.requirements); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.time.format.DateTimeFormatter TIME_FORMATTER() { return wrapperContained.TIME_FORMATTER; }
// public com.mojang.serialization.Codec TIME_CODEC() { return wrapperContained.TIME_CODEC; }
// public com.mojang.serialization.Codec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public boolean isCriterionObtained(java.lang.String name) { return wrapperContained.isCriterionObtained(name); }
public void init(yarnwrap.advancement.AdvancementRequirements requirements) { wrapperContained.init(requirements.wrapperContained); }
public yarnwrap.text.Text getProgressBarFraction() { return new yarnwrap.text.Text(wrapperContained.getProgressBarFraction()); }
public boolean reset(java.lang.String name) { return wrapperContained.reset(name); }
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