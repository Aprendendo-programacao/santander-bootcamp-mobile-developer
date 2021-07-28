# Ciclo de vida de uma activity

### onCreate

* Responsável pela criação de toda a estrutura do projeto

* **Exemplo**

  ```kotlin
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }
  ```

### onStart

```kotlin
override fun onStart() {
    super.onStart()
}
```

### onResume

* Aplicativo pronto para uso (tela criada, configurações definidas, etc)

* **Exemplo**

  ```kotlin
  override fun onResume() {
      super.onResume()
  }
  ```

### onPause

```kotlin
override fun onPause() {
    super.onPause()
}
```

### onStop

* Aplicativo em segundo plano

* **Exemplo**

  ```kotlin
  override fun onStop() {
      super.onStop()
  }
  ```

### onDestroy

* Fim da execução do aplicativo (fechar o app)

* **Exemplo**

  ```kotlin
  override fun onDestroy() {
      super.onDestroy()
  }
  ```