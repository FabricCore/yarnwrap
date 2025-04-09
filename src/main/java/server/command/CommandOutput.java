package yarnwrap.server.command;
public class CommandOutput { public net.minecraft.server.command.CommandOutput wrapperContained; public CommandOutput(net.minecraft.server.command.CommandOutput wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.server.command.CommandOutput DUMMY() { return new yarnwrap.server.command.CommandOutput(wrapperContained.DUMMY); }
public boolean cannotBeSilenced() { return wrapperContained.cannotBeSilenced(); }
public void sendMessage(yarnwrap.text.Text message) { wrapperContained.sendMessage(message.wrapperContained); }
public boolean shouldReceiveFeedback() { return wrapperContained.shouldReceiveFeedback(); }
public boolean shouldBroadcastConsoleToOps() { return wrapperContained.shouldBroadcastConsoleToOps(); }
public boolean shouldTrackOutput() { return wrapperContained.shouldTrackOutput(); }

}