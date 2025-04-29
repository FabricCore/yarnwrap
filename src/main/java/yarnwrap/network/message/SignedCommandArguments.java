package yarnwrap.network.message;
public class SignedCommandArguments { public net.minecraft.network.message.SignedCommandArguments wrapperContained; public SignedCommandArguments(net.minecraft.network.message.SignedCommandArguments wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.message.SignedCommandArguments EMPTY() { return new yarnwrap.network.message.SignedCommandArguments(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.network.message.SignedCommandArguments value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.network.message.SignedCommandArguments EMPTY() { return new yarnwrap.network.message.SignedCommandArguments(net.minecraft.network.message.SignedCommandArguments.EMPTY); }
// public static void EMPTY(yarnwrap.network.message.SignedCommandArguments value, ) { net.minecraft.network.message.SignedCommandArguments.EMPTY = value.wrapperContained; }

public yarnwrap.network.message.SignedMessage getMessage(java.lang.String argumentName) { return new yarnwrap.network.message.SignedMessage(wrapperContained.getMessage(argumentName)); }
// public static yarnwrap.network.message.SignedMessage getMessage(java.lang.String argumentName, ) { return new yarnwrap.network.message.SignedMessage(net.minecraft.network.message.SignedCommandArguments.getMessage(argumentName)); }

}