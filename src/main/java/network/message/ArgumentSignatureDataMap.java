package yarnwrap.network.message;
public class ArgumentSignatureDataMap { public net.minecraft.network.message.ArgumentSignatureDataMap wrapperContained; public ArgumentSignatureDataMap(net.minecraft.network.message.ArgumentSignatureDataMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_ARGUMENT_NAME_LENGTH() { return wrapperContained.MAX_ARGUMENT_NAME_LENGTH; }
// public int MAX_ARGUMENTS() { return wrapperContained.MAX_ARGUMENTS; }
public yarnwrap.network.message.ArgumentSignatureDataMap EMPTY() { return new yarnwrap.network.message.ArgumentSignatureDataMap(wrapperContained.EMPTY); }
public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public yarnwrap.network.message.ArgumentSignatureDataMap sign(yarnwrap.command.argument.SignedArgumentList arguments,Object signer) { return new yarnwrap.network.message.ArgumentSignatureDataMap(wrapperContained.sign(arguments.wrapperContained,signer)); }

}