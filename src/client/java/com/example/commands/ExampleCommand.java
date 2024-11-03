package com.example.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.minecraft.command.CommandSource;
import org.jetbrains.annotations.NotNull;
import thunder.hack.features.cmd.Command;


import static com.mojang.brigadier.Command.SINGLE_SUCCESS;

public class ExampleCommand extends Command {
    public ExampleCommand() {
        super("example");
    }

    @Override
    public void executeBuild(@NotNull LiteralArgumentBuilder<CommandSource> builder) {
        builder.executes(context -> {
            sendMessage("Hello World!");

            return SINGLE_SUCCESS;
        });
    }
}