package yarnwrap.client.realms.exception;
public class RealmsServiceException { public net.minecraft.client.realms.exception.RealmsServiceException wrapperContained; public RealmsServiceException(net.minecraft.client.realms.exception.RealmsServiceException wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.realms.RealmsError error() { return new yarnwrap.client.realms.RealmsError(wrapperContained.error); }
// public void error(yarnwrap.client.realms.RealmsError value) { wrapperContained.error = value.wrapperContained; }
// public static yarnwrap.client.realms.RealmsError error() { return new yarnwrap.client.realms.RealmsError(net.minecraft.client.realms.exception.RealmsServiceException.error); }
// public static void error(yarnwrap.client.realms.RealmsError value, ) { net.minecraft.client.realms.exception.RealmsServiceException.error = value.wrapperContained; }

public RealmsServiceException(yarnwrap.client.realms.RealmsError error) { this.wrapperContained = new net.minecraft.client.realms.exception.RealmsServiceException(error.wrapperContained); }

}