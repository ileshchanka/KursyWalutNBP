package info.igorek.kursywalutnbp.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = []
)
@Singleton
interface AppComponent {

    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun context(context: Context): Builder
    }

    companion object {
        private var component: AppComponent? = null

        fun init(context: Context) {
            component = DaggerAppComponent.builder()
                .context(context)
                .build().apply {
                    component = this
                }
        }

        fun get(): AppComponent {
            return component ?: throw NotImplementedError("You should call 'init' method")
        }
    }
}
