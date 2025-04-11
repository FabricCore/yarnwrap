package yarnwrap.village;
public class VillagerData { public net.minecraft.village.VillagerData wrapperContained; public VillagerData(net.minecraft.village.VillagerData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.VillagerType type() { return new yarnwrap.village.VillagerType(wrapperContained.type); }
// public void type(yarnwrap.village.VillagerType value) { wrapperContained.type = value.wrapperContained; }
// public yarnwrap.village.VillagerProfession profession() { return new yarnwrap.village.VillagerProfession(wrapperContained.profession); }
// public void profession(yarnwrap.village.VillagerProfession value) { wrapperContained.profession = value.wrapperContained; }
// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public int[] LEVEL_BASE_EXPERIENCE() { return wrapperContained.LEVEL_BASE_EXPERIENCE; }
// public void LEVEL_BASE_EXPERIENCE(int[] value) { wrapperContained.LEVEL_BASE_EXPERIENCE = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public int MIN_LEVEL() { return wrapperContained.MIN_LEVEL; }
// public void MIN_LEVEL(int value) { wrapperContained.MIN_LEVEL = value; }
public int MAX_LEVEL() { return wrapperContained.MAX_LEVEL; }
// public void MAX_LEVEL(int value) { wrapperContained.MAX_LEVEL = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.village.VillagerType getType() { return new yarnwrap.village.VillagerType(wrapperContained.getType()); }
public yarnwrap.village.VillagerData withLevel(int level) { return new yarnwrap.village.VillagerData(wrapperContained.withLevel(level)); }
public yarnwrap.village.VillagerData withProfession(yarnwrap.village.VillagerProfession profession) { return new yarnwrap.village.VillagerData(wrapperContained.withProfession(profession.wrapperContained)); }
public yarnwrap.village.VillagerData withType(yarnwrap.village.VillagerType type) { return new yarnwrap.village.VillagerData(wrapperContained.withType(type.wrapperContained)); }
public yarnwrap.village.VillagerProfession getProfession() { return new yarnwrap.village.VillagerProfession(wrapperContained.getProfession()); }
public int getLevel() { return wrapperContained.getLevel(); }
public int getLowerLevelExperience(int level) { return wrapperContained.getLowerLevelExperience(level); }
public int getUpperLevelExperience(int level) { return wrapperContained.getUpperLevelExperience(level); }
public boolean canLevelUp(int level) { return wrapperContained.canLevelUp(level); }

}