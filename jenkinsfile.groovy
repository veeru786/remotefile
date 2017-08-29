#!groovy
stage 'Load a file from GitHub'
def helloworld = fileLoader.fromGit('examples/fileLoader/helloworld', 
        'https://github.com/veeru786/remotefile.git', 'master', null, '')

	stage 'Run method from the loaded file'
	helloworld.printHello();
	return this;
