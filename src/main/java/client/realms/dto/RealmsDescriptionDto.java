package yarnwrap.client.realms.dto;
public class RealmsDescriptionDto { public net.minecraft.client.realms.dto.RealmsDescriptionDto wrapperContained; public RealmsDescriptionDto(net.minecraft.client.realms.dto.RealmsDescriptionDto wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String name() { return wrapperContained.name; }
public java.lang.String description() { return wrapperContained.description; }

}