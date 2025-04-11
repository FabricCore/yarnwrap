package yarnwrap.command.argument;
public class ScoreboardSlotArgumentType { public net.minecraft.command.argument.ScoreboardSlotArgumentType wrapperContained; public ScoreboardSlotArgumentType(net.minecraft.command.argument.ScoreboardSlotArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public com.mojang.brigadier.exceptions.DynamicCommandExceptionType INVALID_SLOT_EXCEPTION() { return wrapperContained.INVALID_SLOT_EXCEPTION; }
// public void INVALID_SLOT_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.INVALID_SLOT_EXCEPTION = value; }
public yarnwrap.scoreboard.ScoreboardDisplaySlot getScoreboardSlot(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.scoreboard.ScoreboardDisplaySlot(wrapperContained.getScoreboardSlot(context,name)); }
public yarnwrap.command.argument.ScoreboardSlotArgumentType scoreboardSlot() { return new yarnwrap.command.argument.ScoreboardSlotArgumentType(wrapperContained.scoreboardSlot()); }

}