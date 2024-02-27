import random

def generate_talkgpt_prompt():
  """Generates a prompt for the TalkGPT model."""

  # Choose a topic
  topics = ["science", "history", "philosophy", "art", "literature"]
  topic = random.choice(topics)

  # Generate a prompt based on the topic
  if topic == "science":
    prompt = "Can you explain the theory of relativity in a way that a child could understand?"
  elif topic == "history":
    prompt = "What were the main causes of the American Civil War?"
  elif topic == "philosophy":
    prompt = "What is the meaning of life?"
  elif topic == "art":
    prompt = "What are the different elements of a painting?"
  elif topic == "literature":
    prompt = "What is the theme of Shakespeare's Hamlet?"

  return prompt

# Generate a prompt
prompt = generate_talkgpt_prompt()

# Print the prompt
print(prompt)