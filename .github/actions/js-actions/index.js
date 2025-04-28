const core = require('@actions/core');

try {
  core.info('Hello from JavaScript!');
} catch (error) {
  core.setFailed(error.message);
}