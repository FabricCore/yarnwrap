package yarnwrap.client.realms.exception;
public class RealmsServiceException { public net.minecraft.client.realms.exception.RealmsServiceException wrapperContained; public RealmsServiceException(net.minecraft.client.realms.exception.RealmsServiceException wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.realms.RealmsError error() { return new yarnwrap.client.realms.RealmsError(wrapperContained.error); }

}