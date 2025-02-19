# Topaz Design System Library KMP 🎨🚀

Topaz é uma Design System KMP de componentes reutilizáveis para Jetpack Compose, projetada para facilitar o desenvolvimento de UIs modernas no Android e Kotlin Multiplatform.


## 📥 Instalação Local

### 1️⃣ Clone o Repositório

Primeiro, faça o clone do projeto:

```kotlin
git clone git@github.com:vitor0321/topaz.git
```
### 2️⃣ Publique a Library no Maven Local

Dentro da pasta do projeto Topaz, publique a library no Maven Local:

```kotlin
./gradlew publishToMavenLocal
```

### 3️⃣ Configure o Maven Local no Seu Projeto

No arquivo `settings.gradle.kts` do seu projeto, adicione o Maven Local para permitir que o `Gradle` encontre a biblioteca:

```kotlin
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        mavenLocal() // 🔥 Adicione esta linha
    }
}
```

### 4️⃣ Adicione a Dependência do Topaz

Agora, no `build.gradle.kts` do módulo `app`, adicione a dependência:

```kotlin
dependencies {
    implementation("com.walcker.compose.ui:topaz:0.0.1")
}
```

### 5️⃣ Sincronize o Projeto
Após adicionar a dependência, sincronize o projeto (Sync Project with Gradle Files).


## 🚀 Usando os Componentes do Topaz
Agora, você pode começar a utilizar os componentes disponíveis. Exemplo:

```kotlin
@Composable
fun ExampleScreen() {
    TopazDividerHorizontal(
        size: TopazDividerSize = TopazDividerSize.Medium
    )
}
```

## 📌 Nota: No futuro, disponibilizaremos mais componentes e documentações detalhadas.

### 📄 Contribuição
Sinta-se à vontade para abrir issues, pull requests e sugestões para melhorar a biblioteca!

## 📌 Repositório: [GitHub - Topaz](https://github.com/vitor0321/topaz)

# 🔥 Agora você está pronto para usar o Topaz UI! 🚀🎨
Se precisar de suporte, entre em contato ou abra uma issue no GitHub!
