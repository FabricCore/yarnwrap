package yarnwrap.client.realms.exception;
public class RealmsHttpException { public net.minecraft.client.realms.exception.RealmsHttpException wrapperContained; public RealmsHttpException(net.minecraft.client.realms.exception.RealmsHttpException wrapperContained) { this.wrapperContained = wrapperContained; }

public RealmsHttpException(java.lang.String s,java.lang.Exception e) { this.wrapperContained = new net.minecraft.client.realms.exception.RealmsHttpException(s,e); }

}