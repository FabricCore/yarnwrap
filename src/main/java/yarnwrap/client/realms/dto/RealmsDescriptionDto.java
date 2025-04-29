package yarnwrap.client.realms.dto;
public class RealmsDescriptionDto { public net.minecraft.client.realms.dto.RealmsDescriptionDto wrapperContained; public RealmsDescriptionDto(net.minecraft.client.realms.dto.RealmsDescriptionDto wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String name() { return wrapperContained.name; }
public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.realms.dto.RealmsDescriptionDto.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsDescriptionDto.name = value; }

public java.lang.String description() { return wrapperContained.description; }
public void description(java.lang.String value) { wrapperContained.description = value; }
// public static java.lang.String description() { return net.minecraft.client.realms.dto.RealmsDescriptionDto.description; }
// public static void description(java.lang.String value, ) { net.minecraft.client.realms.dto.RealmsDescriptionDto.description = value; }

public RealmsDescriptionDto(java.lang.String name,java.lang.String description) { this.wrapperContained = new net.minecraft.client.realms.dto.RealmsDescriptionDto(name,description); }

}