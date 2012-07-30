Stork
=======

Mob controlling, spawner removing.

About
-----
We needed to remove spawners on our server, due to people taking advantage of them. We still wanted some sort of reward for finding them, so we decided to turn ours into diamond blocks.

Since we removed spawners, we also needed a way to spawn blazes in the nether. We added hooks to spawn them at a specified interval with pigmen in the same location.

Config
------
+*enablereplacement* - (*true*/false) Enables the replacement of spawners.
+*replacement* - (itemId(*57*)) The item to replace the spawners with, use air to remove them.

+*enableblazes* - (*true*/false) Enables the spawning system for blazes.
+*blazespawntype* - (WorldType(*nether*)) Doesn't do anything at the moment.
+*blazeoccurence* - (int(*20*)) Blazes should spawn every x (whatever you set here) pigmen.
+*blazecount* - (int(*1*)) This many blazes will spawn per occurence.

