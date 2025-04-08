# Eldoria Game - Week 6 Project

## Description
This Java Maven project models a fantasy game system where heroes and enemies interact through quests and battles.

## Classes Overview

- **Character (abstract)**: Base class with name, level, and a 'speak()' method.
- **Hero**: Extends Character. Parent class for Mage and Warrior.
- **Enemy**: Extends Character.
- **Questable (interface)**: Characters that can accept the quests.
- **Mage**: A hero that casts spells and accepts quests.
- **Warrior**: A hero that performs melee attacks and accepts quests.
- **QuestBoard**: Assigns quests to Questable characters.
- **BattleManager**: Simulates battles between a Hero and an Enemy.
