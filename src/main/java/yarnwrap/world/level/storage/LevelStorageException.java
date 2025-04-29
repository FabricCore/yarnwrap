package yarnwrap.world.level.storage;
public class LevelStorageException { public net.minecraft.world.level.storage.LevelStorageException wrapperContained; public LevelStorageException(net.minecraft.world.level.storage.LevelStorageException wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text messageText() { return new yarnwrap.text.Text(wrapperContained.messageText); }
// public void messageText(yarnwrap.text.Text value) { wrapperContained.messageText = value.wrapperContained; }
// public static yarnwrap.text.Text messageText() { return new yarnwrap.text.Text(net.minecraft.world.level.storage.LevelStorageException.messageText); }
// public static void messageText(yarnwrap.text.Text value, ) { net.minecraft.world.level.storage.LevelStorageException.messageText = value.wrapperContained; }

public LevelStorageException(yarnwrap.text.Text messageText) { this.wrapperContained = new net.minecraft.world.level.storage.LevelStorageException(messageText.wrapperContained); }
public yarnwrap.text.Text getMessageText() { return new yarnwrap.text.Text(wrapperContained.getMessageText()); }
// public static yarnwrap.text.Text getMessageText() { return new yarnwrap.text.Text(net.minecraft.world.level.storage.LevelStorageException.getMessageText()); }

}