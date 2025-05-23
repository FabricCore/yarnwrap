package yarnwrap.server.command;
public class CommandOutput { public net.minecraft.server.command.CommandOutput wrapperContained; public CommandOutput(net.minecraft.server.command.CommandOutput wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.command.CommandOutput DUMMY() { return new yarnwrap.server.command.CommandOutput(wrapperContained.DUMMY); }
// public void DUMMY(yarnwrap.server.command.CommandOutput value) { wrapperContained.DUMMY = value.wrapperContained; }
public static yarnwrap.server.command.CommandOutput DUMMY() { return new yarnwrap.server.command.CommandOutput(net.minecraft.server.command.CommandOutput.DUMMY); }
// public static void DUMMY(yarnwrap.server.command.CommandOutput value, ) { net.minecraft.server.command.CommandOutput.DUMMY = value.wrapperContained; }

public boolean shouldReceiveFeedback() { return wrapperContained.shouldReceiveFeedback(); }
// public static boolean shouldReceiveFeedback() { return net.minecraft.server.command.CommandOutput.shouldReceiveFeedback(); }
public boolean shouldBroadcastConsoleToOps() { return wrapperContained.shouldBroadcastConsoleToOps(); }
// public static boolean shouldBroadcastConsoleToOps() { return net.minecraft.server.command.CommandOutput.shouldBroadcastConsoleToOps(); }
public boolean shouldTrackOutput() { return wrapperContained.shouldTrackOutput(); }
// public static boolean shouldTrackOutput() { return net.minecraft.server.command.CommandOutput.shouldTrackOutput(); }
public boolean cannotBeSilenced() { return wrapperContained.cannotBeSilenced(); }
// public static boolean cannotBeSilenced() { return net.minecraft.server.command.CommandOutput.cannotBeSilenced(); }
public void sendMessage(yarnwrap.text.Text message) { wrapperContained.sendMessage(message.wrapperContained); }
// public static void sendMessage(yarnwrap.text.Text message, ) { net.minecraft.server.command.CommandOutput.sendMessage(message.wrapperContained); }

}