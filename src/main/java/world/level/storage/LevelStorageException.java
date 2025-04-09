package yarnwrap.world.level.storage;
public class LevelStorageException { public net.minecraft.world.level.storage.LevelStorageException wrapperContained; public LevelStorageException(net.minecraft.world.level.storage.LevelStorageException wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text messageText() { return new yarnwrap.text.Text(wrapperContained.messageText); }
public yarnwrap.text.Text getMessageText() { return new yarnwrap.text.Text(wrapperContained.getMessageText()); }

}