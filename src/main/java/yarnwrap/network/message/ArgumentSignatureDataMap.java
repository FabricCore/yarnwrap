package yarnwrap.network.message;
public class ArgumentSignatureDataMap { public net.minecraft.network.message.ArgumentSignatureDataMap wrapperContained; public ArgumentSignatureDataMap(net.minecraft.network.message.ArgumentSignatureDataMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_ARGUMENT_NAME_LENGTH() { return wrapperContained.MAX_ARGUMENT_NAME_LENGTH; }
// public void MAX_ARGUMENT_NAME_LENGTH(int value) { wrapperContained.MAX_ARGUMENT_NAME_LENGTH = value; }
// public int MAX_ARGUMENTS() { return wrapperContained.MAX_ARGUMENTS; }
// public void MAX_ARGUMENTS(int value) { wrapperContained.MAX_ARGUMENTS = value; }
public yarnwrap.network.message.ArgumentSignatureDataMap EMPTY() { return new yarnwrap.network.message.ArgumentSignatureDataMap(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.network.message.ArgumentSignatureDataMap value) { wrapperContained.EMPTY = value.wrapperContained; }
public ArgumentSignatureDataMap(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.message.ArgumentSignatureDataMap(buf.wrapperContained); }
public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public yarnwrap.network.message.ArgumentSignatureDataMap sign(yarnwrap.command.argument.SignedArgumentList arguments,Object signer) { return new yarnwrap.network.message.ArgumentSignatureDataMap(wrapperContained.sign(arguments.wrapperContained,signer)); }
// public void method_44799(yarnwrap.network.PacketByteBuf buf2,Object entry) { wrapperContained.method_44799(buf2.wrapperContained,entry); }
// public Object method_45561(Object argument) { return wrapperContained.method_45561(argument); }

}