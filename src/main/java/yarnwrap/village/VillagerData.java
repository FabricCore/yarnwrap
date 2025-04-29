package yarnwrap.village;
public class VillagerData { public net.minecraft.village.VillagerData wrapperContained; public VillagerData(net.minecraft.village.VillagerData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.village.VillagerType type() { return new yarnwrap.village.VillagerType(wrapperContained.type); }
// public void type(yarnwrap.village.VillagerType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.village.VillagerType type() { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerData.type); }
// public static void type(yarnwrap.village.VillagerType value, ) { net.minecraft.village.VillagerData.type = value.wrapperContained; }

// public yarnwrap.village.VillagerProfession profession() { return new yarnwrap.village.VillagerProfession(wrapperContained.profession); }
// public void profession(yarnwrap.village.VillagerProfession value) { wrapperContained.profession = value.wrapperContained; }
// public static yarnwrap.village.VillagerProfession profession() { return new yarnwrap.village.VillagerProfession(net.minecraft.village.VillagerData.profession); }
// public static void profession(yarnwrap.village.VillagerProfession value, ) { net.minecraft.village.VillagerData.profession = value.wrapperContained; }

// public int level() { return wrapperContained.level; }
// public void level(int value) { wrapperContained.level = value; }
// public static int level() { return net.minecraft.village.VillagerData.level; }
// public static void level(int value, ) { net.minecraft.village.VillagerData.level = value; }

// public int[] LEVEL_BASE_EXPERIENCE() { return wrapperContained.LEVEL_BASE_EXPERIENCE; }
// public void LEVEL_BASE_EXPERIENCE(int[] value) { wrapperContained.LEVEL_BASE_EXPERIENCE = value; }
// public static int[] LEVEL_BASE_EXPERIENCE() { return net.minecraft.village.VillagerData.LEVEL_BASE_EXPERIENCE; }
// public static void LEVEL_BASE_EXPERIENCE(int[] value, ) { net.minecraft.village.VillagerData.LEVEL_BASE_EXPERIENCE = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.village.VillagerData.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.village.VillagerData.CODEC = value; }

// public int MIN_LEVEL() { return wrapperContained.MIN_LEVEL; }
// public void MIN_LEVEL(int value) { wrapperContained.MIN_LEVEL = value; }
public static int MIN_LEVEL() { return net.minecraft.village.VillagerData.MIN_LEVEL; }
// public static void MIN_LEVEL(int value, ) { net.minecraft.village.VillagerData.MIN_LEVEL = value; }

// public int MAX_LEVEL() { return wrapperContained.MAX_LEVEL; }
// public void MAX_LEVEL(int value) { wrapperContained.MAX_LEVEL = value; }
public static int MAX_LEVEL() { return net.minecraft.village.VillagerData.MAX_LEVEL; }
// public static void MAX_LEVEL(int value, ) { net.minecraft.village.VillagerData.MAX_LEVEL = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.village.VillagerData.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.village.VillagerData.PACKET_CODEC = value.wrapperContained; }

public VillagerData(yarnwrap.village.VillagerType type,yarnwrap.village.VillagerProfession profession,int level) { this.wrapperContained = new net.minecraft.village.VillagerData(type.wrapperContained,profession.wrapperContained,level); }
public yarnwrap.village.VillagerType getType() { return new yarnwrap.village.VillagerType(wrapperContained.getType()); }
// public static yarnwrap.village.VillagerType getType() { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerData.getType()); }
public yarnwrap.village.VillagerData withLevel(int level) { return new yarnwrap.village.VillagerData(wrapperContained.withLevel(level)); }
// public static yarnwrap.village.VillagerData withLevel(int level, ) { return new yarnwrap.village.VillagerData(net.minecraft.village.VillagerData.withLevel(level)); }
public yarnwrap.village.VillagerData withProfession(yarnwrap.village.VillagerProfession profession) { return new yarnwrap.village.VillagerData(wrapperContained.withProfession(profession.wrapperContained)); }
// public static yarnwrap.village.VillagerData withProfession(yarnwrap.village.VillagerProfession profession, ) { return new yarnwrap.village.VillagerData(net.minecraft.village.VillagerData.withProfession(profession.wrapperContained)); }
public yarnwrap.village.VillagerData withType(yarnwrap.village.VillagerType type) { return new yarnwrap.village.VillagerData(wrapperContained.withType(type.wrapperContained)); }
// public static yarnwrap.village.VillagerData withType(yarnwrap.village.VillagerType type, ) { return new yarnwrap.village.VillagerData(net.minecraft.village.VillagerData.withType(type.wrapperContained)); }
public yarnwrap.village.VillagerProfession getProfession() { return new yarnwrap.village.VillagerProfession(wrapperContained.getProfession()); }
// public static yarnwrap.village.VillagerProfession getProfession() { return new yarnwrap.village.VillagerProfession(net.minecraft.village.VillagerData.getProfession()); }
public int getLevel() { return wrapperContained.getLevel(); }
// public static int getLevel() { return net.minecraft.village.VillagerData.getLevel(); }
// public int getLowerLevelExperience(int level) { return wrapperContained.getLowerLevelExperience(level); }
// public static int getLowerLevelExperience(int level, ) { return net.minecraft.village.VillagerData.getLowerLevelExperience(level); }
// public int getUpperLevelExperience(int level) { return wrapperContained.getUpperLevelExperience(level); }
// public static int getUpperLevelExperience(int level, ) { return net.minecraft.village.VillagerData.getUpperLevelExperience(level); }
// public boolean canLevelUp(int level) { return wrapperContained.canLevelUp(level); }
// public static boolean canLevelUp(int level, ) { return net.minecraft.village.VillagerData.canLevelUp(level); }
// public java.lang.Integer method_28371(yarnwrap.village.VillagerData data) { return wrapperContained.method_28371(data.wrapperContained); }
// public static java.lang.Integer method_28371(yarnwrap.village.VillagerData data, ) { return net.minecraft.village.VillagerData.method_28371(data.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28372(Object instance) { return wrapperContained.method_28372(instance); }
// public static com.mojang.datafixers.kinds.App method_28372(Object instance, ) { return net.minecraft.village.VillagerData.method_28372(instance); }
// public yarnwrap.village.VillagerProfession method_28373(yarnwrap.village.VillagerData data) { return new yarnwrap.village.VillagerProfession(wrapperContained.method_28373(data.wrapperContained)); }
// public static yarnwrap.village.VillagerProfession method_28373(yarnwrap.village.VillagerData data, ) { return new yarnwrap.village.VillagerProfession(net.minecraft.village.VillagerData.method_28373(data.wrapperContained)); }
// public yarnwrap.village.VillagerType method_28374(yarnwrap.village.VillagerData data) { return new yarnwrap.village.VillagerType(wrapperContained.method_28374(data.wrapperContained)); }
// public static yarnwrap.village.VillagerType method_28374(yarnwrap.village.VillagerData data, ) { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerData.method_28374(data.wrapperContained)); }
// public java.lang.Integer method_56089(yarnwrap.village.VillagerData data) { return wrapperContained.method_56089(data.wrapperContained); }
// public static java.lang.Integer method_56089(yarnwrap.village.VillagerData data, ) { return net.minecraft.village.VillagerData.method_56089(data.wrapperContained); }
// public yarnwrap.village.VillagerProfession method_56090(yarnwrap.village.VillagerData data) { return new yarnwrap.village.VillagerProfession(wrapperContained.method_56090(data.wrapperContained)); }
// public static yarnwrap.village.VillagerProfession method_56090(yarnwrap.village.VillagerData data, ) { return new yarnwrap.village.VillagerProfession(net.minecraft.village.VillagerData.method_56090(data.wrapperContained)); }
// public yarnwrap.village.VillagerType method_56091(yarnwrap.village.VillagerData data) { return new yarnwrap.village.VillagerType(wrapperContained.method_56091(data.wrapperContained)); }
// public static yarnwrap.village.VillagerType method_56091(yarnwrap.village.VillagerData data, ) { return new yarnwrap.village.VillagerType(net.minecraft.village.VillagerData.method_56091(data.wrapperContained)); }

}