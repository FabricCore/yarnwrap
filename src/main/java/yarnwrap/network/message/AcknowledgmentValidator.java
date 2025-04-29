package yarnwrap.network.message;
public class AcknowledgmentValidator { public net.minecraft.network.message.AcknowledgmentValidator wrapperContained; public AcknowledgmentValidator(net.minecraft.network.message.AcknowledgmentValidator wrapperContained) { this.wrapperContained = wrapperContained; }

// public int size() { return wrapperContained.size; }
// public void size(int value) { wrapperContained.size = value; }
// public static int size() { return net.minecraft.network.message.AcknowledgmentValidator.size; }
// public static void size(int value, ) { net.minecraft.network.message.AcknowledgmentValidator.size = value; }

// public it.unimi.dsi.fastutil.objects.ObjectList messages() { return wrapperContained.messages; }
// public void messages(it.unimi.dsi.fastutil.objects.ObjectList value) { wrapperContained.messages = value; }
// public static it.unimi.dsi.fastutil.objects.ObjectList messages() { return net.minecraft.network.message.AcknowledgmentValidator.messages; }
// public static void messages(it.unimi.dsi.fastutil.objects.ObjectList value, ) { net.minecraft.network.message.AcknowledgmentValidator.messages = value; }

// public yarnwrap.network.message.MessageSignatureData lastSignature() { return new yarnwrap.network.message.MessageSignatureData(wrapperContained.lastSignature); }
// public void lastSignature(yarnwrap.network.message.MessageSignatureData value) { wrapperContained.lastSignature = value.wrapperContained; }
// public static yarnwrap.network.message.MessageSignatureData lastSignature() { return new yarnwrap.network.message.MessageSignatureData(net.minecraft.network.message.AcknowledgmentValidator.lastSignature); }
// public static void lastSignature(yarnwrap.network.message.MessageSignatureData value, ) { net.minecraft.network.message.AcknowledgmentValidator.lastSignature = value.wrapperContained; }

public AcknowledgmentValidator(int size) { this.wrapperContained = new net.minecraft.network.message.AcknowledgmentValidator(size); }
public void addPending(yarnwrap.network.message.MessageSignatureData signature) { wrapperContained.addPending(signature.wrapperContained); }
// public static void addPending(yarnwrap.network.message.MessageSignatureData signature, ) { net.minecraft.network.message.AcknowledgmentValidator.addPending(signature.wrapperContained); }
public int getMessageCount() { return wrapperContained.getMessageCount(); }
// public static int getMessageCount() { return net.minecraft.network.message.AcknowledgmentValidator.getMessageCount(); }
public boolean removeUntil(int index) { return wrapperContained.removeUntil(index); }
// public static boolean removeUntil(int index, ) { return net.minecraft.network.message.AcknowledgmentValidator.removeUntil(index); }
// public java.util.Optional validate(Object acknowledgment) { return wrapperContained.validate(acknowledgment); }
// public static java.util.Optional validate(Object acknowledgment, ) { return net.minecraft.network.message.AcknowledgmentValidator.validate(acknowledgment); }

}