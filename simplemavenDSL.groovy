job('First-Maven-Project-Via-DSLJob') {
    description("First Maven job generated by the DSL")},
    scm {
        git("https://github.com/gauravbhalekar5/webapp-project.git", 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package', 'pom.xml')
    }
    publishers {
        //archive the war file generated
        archiveArtifacts '**/*.jar'
    }
}
