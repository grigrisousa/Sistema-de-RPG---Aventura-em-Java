# Sistema de RPG - Aventura em Java

O **Legends of Java** é um sistema de RPG desenvolvido em Java com o objetivo de aplicar, na prática, os principais conceitos de Programação Orientada a Objetos (POO). O projeto simula personagens com diferentes classes, cada um com habilidades únicas, permitindo batalhas e evolução por meio de experiência.

---

## 📋 Requisitos Obrigatórios

### Técnicos:
- ✅ Usar classe abstrata Personagem
- ✅ Implementar pelo menos 2 métodos abstratos
- ✅ Criar 3 classes concretas que herdam de Personagem
- ✅ Aplicar polimorfismo (array/ArrayList de Personagem)
- ✅ Usar encapsulamento (atributos private/protected)
- ✅ Implementar construtores adequados
- ✅ Sobrescrever métodos corretamente (@Override)

### Funcionalidades:
- ✅ Sistema de combate funcional
- ✅ Sistema de experiência e level up
- ✅ Habilidades especiais únicas por classe
- ✅ Gerenciamento de recursos (vida, mana, flechas)
- ✅ Batalhas entre personagens
- ✅ Torneio eliminatório

---

## 🏗️ Estrutura do Projeto

```
src/
└── br/com/rpg/
    ├── modelo/
    │   ├── Personagem.java    (Classe abstrata)
    │   ├── Guerreiro.java     (Classe concreta)
    │   ├── Mago.java          (Classe concreta)
    │   └── Arqueiro.java      (Classe concreta)
    ├── sistema/
    │   └── Arena.java         (Batalhas e Torneio)
    └── principal/
        └── JogoRPG.java       (Main)
```

---

## 🎮 Classes do Jogo

### Personagem (Classe Abstrata)
Classe base que define os atributos e métodos comuns a todos os personagens.

**Atributos:**
- `nome` - Nome do personagem
- `nivel` - Nível atual (inicia em 1)
- `vida` / `vidaMaxima` - Vida atual e máxima
- `mana` / `manaMaxima` - Mana atual e máxima
- `ataque` - Poder de ataque
- `defesa` - Capacidade de defesa
- `experiencia` - Pontos de experiência (100 para level up)

**Métodos:**
- `exibirStatus()` - Exibe informações completas do personagem
- `receberDano(int dano)` - Calcula e aplica dano (dano - defesa/2)
- `curar(int quantidade)` - Cura o personagem
- `ganharExperiencia(int exp)` - Ganha experiência e sobe de nível
- `subirNivel()` - Aumenta atributos ao subir de nível
- `estaVivo()` - Verifica se o personagem está vivo
- `temMana(int custo)` - Verifica se tem mana suficiente
- `consumirMana(int custo)` - Consome mana

**Métodos Abstratos:**
- `getTipo()` - Retorna o tipo do personagem
- `atacar(Personagem alvo)` - Ataque básico
- `usarHabilidadeEspecial(Personagem alvo)` - Habilidade especial

---

### Guerreiro
Classe de combate corpo a corpo com alta resistência.

**Construtor:** `Guerreiro(String nome)`
- Vida: 150 | Mana: 30 | Ataque: 25 | Defesa: 20

**Ataque:** Golpe poderoso (ataque × 1.2)

**Habilidade Especial:** "Investida Furiosa"
- Custo: 20 mana
- Dano: ataque × 2.5

---

### Mago
Classe mágica com alto poder de ataque à distância.

**Construtor:** `Mago(String nome)`
- Vida: 80 | Mana: 120 | Ataque: 30 | Defesa: 8

**Ataque:** Bola de fogo (custo: 10 mana, dano = ataque × 1.5)

**Habilidade Especial:** "Meteoro Arcano"
- Custo: 40 mana
- Dano: ataque × 3.0

**Método Exclusivo:** `regenerarMana(int quantidade)` - Regenera mana

---

### Arqueiro
Classe de ataque à distância com gerenciamento de flechas.

**Construtor:** `Arqueiro(String nome)`
- Vida: 100 | Mana: 50 | Ataque: 28 | Defesa: 12 | Flechas: 30

**Ataque:** Flecha certeira (custo: 1 flecha, dano = ataque × 1.3)

**Habilidade Especial:** "Chuva de Flechas"
- Custo: 15 mana + 5 flechas
- Executa 3 ataques

**Método Exclusivo:** `recarregarFlechas(int quantidade)` - Recarrega flechas

---

### Arena
Sistema de batalhas e torneios.

**Métodos:**
- `batalhar(Personagem p1, Personagem p2)` - Batalha 1v1
- `exibirStatus(Personagem p1, Personagem p2)` - Exibe status dos combatentes
- `torneo(ArrayList<Personagem> participantes)` - Torneio eliminatório

---

## 🚀 Como Executar

1. Compile o projeto:
```bash
javac -d out src/br/com/rpg/**/*.java
```

2. Execute o jogo:
```bash
java -cp out br.com.rpg.principal.JogoRPG
```

---

## 📖 Funcionalidades do Jogo

O programa demonstra:

1. **Criação de Personagens** - 3 classes (Guerreiro, Mago, Arqueiro)
2. **Polimorfismo** - ArrayList de Personagem com diferentes implementações
3. **Habilidades Especiais** - Cada classe tem sua habilidade única
4. **Métodos Exclusivos** - regenerarMana() e recarregarFlechas()
5. **Sistema de Experiência** - 100 XP para level up
6. **Batalha Individual** - Combate 1v1
7. **Torneio** - Eliminatória com 4 participantes

---

## 💡 Conceitos POO Aplicados

| Conceito | Aplicação |
|----------|-----------|
| **Abstração** | Classe `Personagem` abstrata com métodos abstratos |
| **Herança** | `Guerreiro`, `Mago`, `Arqueiro` extends `Personagem` |
| **Polimorfismo** | ArrayList<Personagem> armazenando diferentes tipos |
| **Encapsulamento** | Atributos private com getters/setters |
| **Sobrescrita** | @Override em atacar(), usarHabilidadeEspecial(), getTipo() |

---

## 📝 Licença

Este projeto foi desenvolvido para fins educacionais.
