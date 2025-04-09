package yarnwrap.network.message;
public class SignedCommandArguments { public net.minecraft.network.message.SignedCommandArguments wrapperContained; public SignedCommandArguments(net.minecraft.network.message.SignedCommandArguments wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.message.SignedCommandArguments EMPTY() { return new yarnwrap.network.message.SignedCommandArguments(wrapperContained.EMPTY); }
public yarnwrap.network.message.SignedMessage getMessage(java.lang.String argumentName) { return new yarnwrap.network.message.SignedMessage(wrapperContained.getMessage(argumentName)); }

}