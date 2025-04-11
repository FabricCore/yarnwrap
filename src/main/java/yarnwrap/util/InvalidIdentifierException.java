package yarnwrap.util;
public class InvalidIdentifierException { public net.minecraft.util.InvalidIdentifierException wrapperContained; public InvalidIdentifierException(net.minecraft.util.InvalidIdentifierException wrapperContained) { this.wrapperContained = wrapperContained; }

public InvalidIdentifierException(java.lang.String message) { this.wrapperContained = new net.minecraft.util.InvalidIdentifierException(message); }
public InvalidIdentifierException(java.lang.String message,java.lang.Throwable throwable) { this.wrapperContained = new net.minecraft.util.InvalidIdentifierException(message,throwable); }

}