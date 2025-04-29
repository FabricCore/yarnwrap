package yarnwrap.client.realms.dto;
public class RealmsWorldResetDto { public net.minecraft.client.realms.dto.RealmsWorldResetDto wrapperContained; public RealmsWorldResetDto(net.minecraft.client.realms.dto.RealmsWorldResetDto wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String seed() { return wrapperContained.seed; }
// public void seed(java.lang.String value) { wrapperContained.seed = value; }
// public static java.lang.String seed() { return net.minecraft.client.realms.dto.RealmsWorldResetDto.seed; }
// public static void seed(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsWorldResetDto.seed = value; }

// public long worldTemplateId() { return wrapperContained.worldTemplateId; }
// public void worldTemplateId(long value) { wrapperContained.worldTemplateId = value; }
// public static long worldTemplateId() { return net.minecraft.client.realms.dto.RealmsWorldResetDto.worldTemplateId; }
// public static void worldTemplateId(long value, ) { net.minecraft.client.realms.dto.RealmsWorldResetDto.worldTemplateId = value; }

// public int levelType() { return wrapperContained.levelType; }
// public void levelType(int value) { wrapperContained.levelType = value; }
// public static int levelType() { return net.minecraft.client.realms.dto.RealmsWorldResetDto.levelType; }
// public static void levelType(int value, ) { net.minecraft.client.realms.dto.RealmsWorldResetDto.levelType = value; }

// public boolean generateStructures() { return wrapperContained.generateStructures; }
// public void generateStructures(boolean value) { wrapperContained.generateStructures = value; }
// public static boolean generateStructures() { return net.minecraft.client.realms.dto.RealmsWorldResetDto.generateStructures; }
// public static void generateStructures(boolean value, ) { net.minecraft.client.realms.dto.RealmsWorldResetDto.generateStructures = value; }

// public java.util.Set experiments() { return wrapperContained.experiments; }
// public void experiments(java.util.Set value) { wrapperContained.experiments = value; }
// public static java.util.Set experiments() { return net.minecraft.client.realms.dto.RealmsWorldResetDto.experiments; }
// public static void experiments(java.util.Set value, ) { net.minecraft.client.realms.dto.RealmsWorldResetDto.experiments = value; }

public RealmsWorldResetDto(java.lang.String seed,long worldTemplateId,int levelType,boolean generateStructures,java.util.Set experiments) { this.wrapperContained = new net.minecraft.client.realms.dto.RealmsWorldResetDto(seed,worldTemplateId,levelType,generateStructures,experiments); }

}