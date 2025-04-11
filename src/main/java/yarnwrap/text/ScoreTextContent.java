package yarnwrap.text;
public class ScoreTextContent { public net.minecraft.text.ScoreTextContent wrapperContained; public ScoreTextContent(net.minecraft.text.ScoreTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String objective() { return wrapperContained.objective; }
// public void objective(java.lang.String value) { wrapperContained.objective = value; }
// public yarnwrap.command.EntitySelector selector() { return new yarnwrap.command.EntitySelector(wrapperContained.selector); }
// public void selector(yarnwrap.command.EntitySelector value) { wrapperContained.selector = value.wrapperContained; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public com.mojang.serialization.MapCodec INNER_CODEC() { return wrapperContained.INNER_CODEC; }
// public void INNER_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.INNER_CODEC = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
public java.lang.String getObjective() { return wrapperContained.getObjective(); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public yarnwrap.scoreboard.ScoreHolder getScoreHolder(yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.scoreboard.ScoreHolder(wrapperContained.getScoreHolder(source.wrapperContained)); }
// public yarnwrap.text.MutableText getScore(yarnwrap.scoreboard.ScoreHolder scoreHolder,yarnwrap.server.command.ServerCommandSource source) { return new yarnwrap.text.MutableText(wrapperContained.getScore(scoreHolder.wrapperContained,source.wrapperContained)); }
// public yarnwrap.command.EntitySelector parseEntitySelector(java.lang.String name) { return new yarnwrap.command.EntitySelector(wrapperContained.parseEntitySelector(name)); }
public yarnwrap.command.EntitySelector getSelector() { return new yarnwrap.command.EntitySelector(wrapperContained.getSelector()); }

}